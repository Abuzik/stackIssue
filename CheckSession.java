import static com.mongodb.client.model.Filters.eq;

import com.mongodb.client.FindIterable;

import com.mongodb.client.MongoCollection;
import org.bson.Document;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@RestController
public class CheckSession {
  @PostMapping("/addInfo")
    public Map<String, String> addInfo(@RequestBody String resp, HttpServletRequest request, HttpSession session, HttpServletResponse response) throws ServletException, IOException {
        boolean flag = true;
        System.out.println(session.getId());
        System.out.println(session.getAttribute("username"));
    }
}
