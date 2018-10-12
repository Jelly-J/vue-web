package sample.context;

import sample.strategy.Strategy;

/**
 * Created by Administrator on 2018/10/12.
 */
public interface StrategyContext<K, S extends Strategy> {
    S register(K key,S strategy);
    S resolve(K key);
}
