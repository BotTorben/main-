package de.thws.Lektion19.Uebung3;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Optional;

public class Browser
{
    public Optional<URL> back() {
        try {
            //simulate: fetch last URL from Stack
            if (Math.random() < 0.5) {
                return Optional.of(new URL("https://www.google.com"));
            } else {
                return Optional.empty();
            }
        } catch (MalformedURLException e) {
            return Optional.empty();
        }
    }

    public String retrieveSite(URL url)
    {
        //simulate download site:
        return url.toString();
    }
    public static void main(String[] args)
    {
        System.out.println("Normal back");
        Browser browser = new Browser();
        Optional<URL> back = browser.back();
        back.ifPresent(url -> browser.retrieveSite(url));
    }
}
