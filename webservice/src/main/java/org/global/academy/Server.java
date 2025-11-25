package org.global.academy;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

import static spark.Spark.get;
import static spark.Spark.port;
import static spark.Spark.post;
import static spark.Spark.staticFiles;

public class Server {

    // Simple flashcard class for the web API
    static class Flashcard {
        String front;
        String back;

        Flashcard(String front, String back) {
            this.front = front;
            this.back = back;
        }
    }

    // Response classes for login
    static class LoginResponse {
        String username;
        String token;

        LoginResponse(String username, String token) {
            this.username = username;
            this.token = token;
        }
    }

    static class ErrorResponse {
        String error;

        ErrorResponse(String error) {
            this.error = error;
        }
    }

    public static void main(String[] args) {

        // Port and static files (HTML)
        port(4567);                      // http://localhost:4567
        staticFiles.location("/public"); // src/main/resources/public

        Gson gson = new Gson();

        // ---------------- LOGIN ----------------
        post("/login", (req, res) -> {
            res.type("application/json");

            System.out.println("Received /login request with body: " + req.body());

            JsonObject body = gson.fromJson(req.body(), JsonObject.class);
            String username = body.get("username").getAsString();
            String password = body.get("password").getAsString();

            if ("alice".equals(username) && "secret".equals(password)) {
                res.status(200);
                return gson.toJson(new LoginResponse(username, "token123"));
            } else {
                res.status(401);
                return gson.toJson(new ErrorResponse("Invalid username or password"));
            }
        });

        // ------------- THAI FLASHCARDS -------------
        // This is the route your welcome.html calls: /showrandcard
        List<Flashcard> cards = Arrays.asList(
                new Flashcard("ก (กอ ไก่)", "ko kai - mid class"),
                new Flashcard("ข (ขอ ไข่)", "kho khai - high class"),
                new Flashcard("ค (คอ ควาย)", "kho khwai - low class"),
                new Flashcard("ง (งอ งู)", "ngo ngu - low class"),
                new Flashcard("จ (จอ จาน)", "cho chan - mid class")
        );

        get("/showrandcard", (req, res) -> {
            res.type("application/json");
            Random r = new Random();
            Flashcard card = cards.get(r.nextInt(cards.size()));
            return gson.toJson(card);
        });

        System.out.println("✅ Server running on http://localhost:4567");
    }
}
