package ch.kalunight.bod.api;

public class BodApi {

  private BodApiConfig config;
  
  private String botId;
  private String tocken;
  
  public BodApi(BodApiConfig bodApiConfig) {
    config = bodApiConfig;
    botId = bodApiConfig.getBotId();
    tocken = bodApiConfig.getTocken();
  }
  
}
