package com.harmony.client;

/**
 * Created by Nick on 3/21/2015.
 */
public class Configuration {
    //Either a resolved IP or a hostname for the network the hub is on. will be used when not on he home WIFI
    public static final String hubInternetAddress  = "hostname.somewhere.org";

    //The IP of the hub in the home WIFI (hopefully it's a static one on the home WIFI, otherwise create some other mechanism to feed it to the app)
    public static final String hubWifiAddress      = "foo";

    //the Name of the home WIFI network the hub is connected to. this will be used to understand which of the above 2 addresses should be used
    public static final String homeWifiSSID        = "foo";

    //the port that the home network is listening on for the XMPP requests if they are sent from outside the home network.
    //this is the external port you configure in the home router with a port forwarding to the local 5222 port of the hub
    //(for some measure of security, as this is not a secure channel, use a random port)
    public static final int    hubInternetXmppPort = 7895;

    //the port that the hub is listening for XMPP requests on in the local WIFI network (XMPP default is 5222)
    public static final int    hubWifiXmppPort     = 5222;

    //the user and password used to log into the myharmony website (or desktop executable as of the latest changes)
    public static final String myHarmonyUser       = "myharmony_site_user_email@address.com";
    public static final String myHarmonyPassword   = "myharmony_site_password";
}