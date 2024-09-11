package app.config;

import static app.config.Utils.*;
import static io.gatling.javaapi.core.CoreDsl.csv;

import io.gatling.javaapi.core.FeederBuilder;

public class PerfFeeders {

  public static final FeederBuilder<String> frFeeder =
      csv("performance-data/" + type + "-data/" + type + "_index_" + frDelay + ".csv").queue();
  public static final FeederBuilder<String> usFeeder =
      csv("performance-data/" + type + "-data/" + type + "_index_" + usDelay + ".csv").queue();
}
