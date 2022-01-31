import com.mongodb.MongoBulkWriteException;
import com.mongodb.client.MongoCollection;
import static com.mongodb.client.model.Filters.eq;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@RestController
public class AdminController {
@PostMapping("/login")
    public Map<String, String> login(@RequestBody Map<String, String> resp, HttpSession session, HttpServletRequest request, HttpServletResponse response) throws Exception {
            session.setAttribute("username", resp.get("username"));
            System.out.println(session.getId());
            System.out.println(session.getAttribute("username"));
            return new ConcurrentHashMap<String, String>(Map.of("answer", "log in"));
    }
}
