package sample.context;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import sample.strategy.Strategy;

/**
 * Created by Administrator on 2018/10/12.
 */
public abstract class UserAbstract implements InitializingBean, Strategy {

    @Autowired
    private UserStrategyContext context;
    @Override
    public void afterPropertiesSet() throws Exception{
        register(context);
    }
}
