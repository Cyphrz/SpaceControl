package me.slamper.spacecontrol.API;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import me.slamper.spacecontrol.Settings;
import me.slamper.spacecontrol.Spacecontrol;
import me.slamper.spacecontrol.Utilities;

public class Server {
	static SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(Spacecontrol.context);
	private static String ip;
	private static String port;
	private static String port_RTK;
	private static String Salt;
public static void getSettings(){
	ip = sharedPref.getString("IP", null);
	port = sharedPref.getString("Port", null);
	port_RTK = sharedPref.getString("rtkp", null);
	Salt = sharedPref.getString("Salt", null);
}
public static String banIp(String ip){
	
return Utilities.sendMethod("banIp", new String[]{ip}, Salt, ip,port);
}


public static String broadcast(String message){

return Utilities.sendMethod("broadcast", new String[]{message}, Salt, ip,port);

}


public static String broadcast(String message,String name){

return Utilities.sendMethod("broadcast", new String[0], Salt, ip,port);

}


public static String disablePluginsTemporarily(){

return Utilities.sendMethod("disablePluginsTemporarily", new String[0], Salt, ip,port);

}


public static String disablePluginTemporarily(String pluginname){

return Utilities.sendMethod("disablePluginTemporarily", new String[0], Salt, ip,port);

}


public static String disableWhitelisting(){

return Utilities.sendMethod("disableWhitelisting", new String[0], Salt, ip,port);

}


public static String editPropertiesFile(String name,String type,String key,String value){

return Utilities.sendMethod("editPropertiesFile", new String[0], Salt, ip,port);

}


public static String enablePluginTemporarily(String pluginname){

return Utilities.sendMethod("enablePluginTemporarily", new String[0], Salt, ip,port);

}


public static String enableWhitelisting(){

return Utilities.sendMethod("enableWhitelisting", new String[0], Salt, ip,port);

}


public static String getDisabledPlugins(){

return Utilities.sendMethod("getDisabledPlugins", new String[0], Salt, ip,port);

}


public static String getDynmapHost(){

return Utilities.sendMethod("getDynmapHost", new String[0], Salt, ip,port);

}


public static String getDynmapPort(){

return Utilities.sendMethod("getDynmapPort", new String[0], Salt, ip,port);

}


public static String getItemName(int id){

return Utilities.sendMethod("getItemName", new String[0], Salt, ip,port);

}


public static String getItems(){

return Utilities.sendMethod("getItems", new String[0], Salt, ip,port);

}


public static String getLatestChats(){

return Utilities.sendMethod("getLatestChats", new String[0], Salt, ip,port);

}


public static String getLatestChats(int limit){

return Utilities.sendMethod("getLatestChatsWithLimit", new String[0], Salt, ip,port);

}


public static String getLatestConnections(){

return Utilities.sendMethod("getLatestConnections", new String[0], Salt, ip,port);

}


public static String getLatestConnections(int limit){

return Utilities.sendMethod("getLatestConnectionsWithLimit", new String[0], Salt, ip,port);

}


public static String getLatestConsoleLogs(){

return Utilities.sendMethod("getLatestConsoleLogs", new String[0], Salt, ip,port);

}


public static String getLatestConsoleLogs(int limit){

return Utilities.sendMethod("getLatestConsoleLogsWithLimit", new String[0], Salt, ip,port);

}


public static String getLatestDeconnections(){

return Utilities.sendMethod("getLatestDeconnections", new String[0], Salt, ip,port);

}


public static String getLatestDeconnections(int limit){

return Utilities.sendMethod("getLatestDeconnectionsWithLimit", new String[0], Salt, ip,port);

}


public static String getPluginInformations(){

return Utilities.sendMethod("getPluginInformations", new String[0], Salt, ip,port);

}


public static String getPlugins(){

return Utilities.sendMethod("getPlugins", new String[0], Salt, ip,port);

}


public static String getServer(){

return Utilities.sendMethod("getServer", new String[0], Salt, ip,port);

}


public static String getWorldInformations(String worldname){

return Utilities.sendMethod("getWorldInformations", new String[0], Salt, ip,port);

}


public static String getWorlds(){

return Utilities.sendMethod("getWorlds", new String[0], Salt, ip,port);

}


public static String isSchedulable(String actionname){

return Utilities.sendMethod("isSchedulable", new String[0], Salt, ip,port);

}


public static String reload(){

return Utilities.sendMethod("reload", new String[0], Salt, ip,port);

}


public static String saveMap(){

return Utilities.sendMethod("saveMap", new String[0], Salt, ip,port);

}


public static String saveOff(){

return Utilities.sendMethod("saveOff", new String[0], Salt, ip,port);

}


public static String saveOn(){

return Utilities.sendMethod("saveOn", new String[0], Salt, ip,port);

}


public static String setWorldWeather(String worldname,Boolean storm,Boolean thunder){

return Utilities.sendMethod("setWorldWeather", new String[0], Salt, ip,port);

}


public static String unbanIp(String ip){

return Utilities.sendMethod("unbanIp", new String[0], Salt, ip,port);

}


public static String wasThereAConnection(int time){

return Utilities.sendMethod("wasThereAConnection", new String[0], Salt, ip,port);

}


public static String permissionsAvailable(){

return Utilities.sendMethod("permissionsAvailable", new String[0], Salt, ip,port);

}


public static String permissionsPluginName(){

return Utilities.sendMethod("permissionsPluginName", new String[0], Salt, ip,port);

}


public static String permissionsPluginVersion(){

return Utilities.sendMethod("permissionsPluginVersion", new String[0], Salt, ip,port);

}


public static String getpermUserNames(){

return Utilities.sendMethod("permUserNames", new String[0], Salt, ip,port);

}


public static String getpermUserNamesForWorld(String worldname){

return Utilities.sendMethod("permUserNamesForWorld", new String[0], Salt, ip,port);

}


public static String getpermGroupNames(){

return Utilities.sendMethod("permGroupNames", new String[0], Salt, ip,port);

}


public static String getpermGroupNamesForWorld(String worldname){

return Utilities.sendMethod("permGroupNamesForWorld", new String[0], Salt, ip,port);

}


public static String getpermGroupUsers(String groupname){

return Utilities.sendMethod("permGroupUsers", new String[0], Salt, ip,port);

}


public static String getpermGroupUsersForWorld(String groupname, String worldname){

return Utilities.sendMethod("permGroupUsersForWorld", new String[0], Salt, ip,port);

}


public static String getgroupPerms(String groupname){

return Utilities.sendMethod("groupPerms", new String[0], Salt, ip,port);

}


public static String getgroupPermsForWorld(String groupname, String worldname){

return Utilities.sendMethod("groupPermsForWorld", new String[0], Salt, ip,port);

}


public static String getUserPerms(String user){

return Utilities.sendMethod("getUserPerms", new String[0], Salt, ip,port);

}


public static String getUsersWithPerm(String permission){

return Utilities.sendMethod("getUsersWithPerm", new String[0], Salt, ip,port);

}


public static String userHasPerm(String username, String permission, String worldname){

return Utilities.sendMethod("userHasPerm", new String[0], Salt, ip,port);

}


public static String getWorldsUserHasPerm(String username,String permission){

return Utilities.sendMethod("getWorldsUserHasPerm", new String[0], Salt, ip,port);

}


}
