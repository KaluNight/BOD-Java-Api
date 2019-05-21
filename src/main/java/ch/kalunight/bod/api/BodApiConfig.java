package ch.kalunight.bod.api;

public class BodApiConfig {

  private String botId;
  private String tocken;
  
  public String getTocken() {
    return tocken;
  }

  public BodApiConfig setTocken(String tocken) {
    this.tocken = tocken;
    return this;
  }

  public String getBotId() {
    return botId;
  }

  public BodApiConfig setBotId(String botId) {
    this.botId = botId;
    return this;
  }
  
}
