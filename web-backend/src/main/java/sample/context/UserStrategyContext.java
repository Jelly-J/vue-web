package sample.context;

import org.springframework.stereotype.Component;
import sample.strategy.Strategy;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/10/12.
 */
@Component
public class UserStrategyContext implements StrategyContext<String, UserAbstract> {

    private Map<String, UserAbstract> map = new HashMap<>();
    @Override
    public UserAbstract register(String key, UserAbstract strategy) {
        return map.put(key,strategy);
    }

    @Override
    public UserAbstract resolve(String key) {
        return map.get(key);
    }
}
