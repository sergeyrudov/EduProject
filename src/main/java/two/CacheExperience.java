package two;


import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import lombok.*;
import org.jetbrains.annotations.NotNull;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CacheExperience {
    private static org.slf4j.Logger LOGGER = LoggerFactory.getLogger(CacheExperience.class);

    public static void main(String args[]) {
        System.out.println(cache(1).isEnabled());
    }

    public static Ticket cache(int id) {
        //create a cache for employees based on their employee id
        LoadingCache<Integer, Ticket> ticketCache =
                CacheBuilder.newBuilder()
                        .maximumSize(100)
                        .expireAfterAccess(30, TimeUnit.MINUTES)
                        .build(new CacheLoader<Integer, Ticket>() {
                            @Override
                            public Ticket load(@NotNull Integer key){
                                return getFromDatabase(key);
                            }
                        });
        try {
            return ticketCache.get(id);
        } catch (CacheLoader.InvalidCacheLoadException | ExecutionException e) {
            LOGGER.info("No such ticket");
            e.printStackTrace();
            return null;
        }
    }


    private static Ticket getFromDatabase(int ticketId) {
        Map<Integer, Ticket> database = new HashMap<Integer, Ticket>();
        database.put(1, new Ticket(true));
        database.put(2, new Ticket(false));
        database.put(3, new Ticket(true));
        return database.get(ticketId);
    }
}

@Data
@Getter
@AllArgsConstructor
class Ticket {
    private boolean enabled;
}