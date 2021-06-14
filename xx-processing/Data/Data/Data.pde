String weburl = "https://api.mapbox.com/styles/v1/mapbox/streets-v11/static/-73.9608,40.6331,11.06,0/500x500?access_token=pk.eyJ1IjoiYmxhemluMCIsImEiOiJja3B2eTAzbngwOHIyMnBwNXRqdWxhNnZmIn0.eOl2zZoZfwiVAoLddpN3BA";
PImage web = loadImage(weburl,"png");
int arrests = 0;
int burg = 0;
int drugs = 0;
void setup(){
  background(255);
  size(500,550);
  image(web,0,0);
  JSONArray NYArrest= loadJSONArray("https://data.cityofnewyork.us/resource/57mv-nv28.json");
  for(int i = 0;i < NYArrest.size();i++){
    JSONObject comp = NYArrest.getJSONObject(i);
    if(comp.getString("ofns_desc") != null){
    arrests++;
      if(comp.getString("ofns_desc").equals("BURGLARY")){
        burg++;
    }
      if(comp.getString("ofns_desc").equals("DANGEROUS DRUGS")){
        drugs++;
      }
    }

  }
  System.out.println("Arrest: "+ arrests); //<>//
  println("Burglary " + burg + " Dangerous Drugs: " + drugs);
}
