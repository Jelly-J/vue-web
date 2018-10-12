package sample.strategy;

import sample.context.StrategyContext;

/**
 * Created by Administrator on 2018/10/12.
 */
public interface Strategy {
    Strategy register(StrategyContext context);
}
