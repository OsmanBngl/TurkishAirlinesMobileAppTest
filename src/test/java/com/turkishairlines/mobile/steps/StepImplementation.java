package com.turkishairlines.mobile.steps;

import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.Table;
import com.thoughtworks.gauge.TableRow;
import com.turkishairlines.mobile.base.BaseTest;
import io.appium.java_client.MobileElement;
import org.checkerframework.checker.units.qual.A;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.HashSet;

import static org.junit.Assert.assertEquals;

public class StepImplementation extends BaseTest {


    @Step("<allow> id li elemente tıklanır")
    public void clickAllowButton(String allow) throws InterruptedException {
        Thread.sleep(1000);
        appiumDriver.findElement(By.id(allow)).click();
        Thread.sleep(1000);
    }

    @Step("<cookies> id li butona tıkla")
    public void clickCookiesButton(String cookies) throws InterruptedException {
        Thread.sleep(1000);
        appiumDriver.findElement(By.id(cookies)).click();
        Thread.sleep(1000);
    }

    @Step("<flight> id li bilet al butonuna tıkla")
    public void clickBookFlight(String flight) throws InterruptedException {
        appiumDriver.findElement(By.id(flight)).click();
        Thread.sleep(1000);
    }

    @Step("<way> id li tek yön uçuşu seç")
    public void clickOneWay(String way){
        appiumDriver.findElement(By.id(way)).click();
    }

    @Step("<direction> id li kalkış havaalanı butonuna tıkla")
    public void clickFromDashboard(String direction) throws InterruptedException {
        Thread.sleep(1000);
        appiumDriver.findElement(By.id(direction)).click();
    }

    @Step("<second> saniye bekle")
    public void wait(int second) throws InterruptedException {
        Thread.sleep(second*1000);
    }
    @Step("<search> id li alana <text> değerini yaz")
    public void selectAirport(String search, String text) throws InterruptedException {

        appiumDriver.findElement(By.id(search)).sendKeys(text);
        Thread.sleep(1000);
    }

    @Step("<air> xpath li elementi seç")
    public void clickAirportSaw(String air) throws InterruptedException {
        appiumDriver.findElement(By.xpath(air)).click();
        Thread.sleep(1000);
    }

    @Step("<key> id li iniş havaalanını seç")
    public void clickAirportEsb(String key) throws InterruptedException {
        appiumDriver.findElement(By.id(key)).click();
        Thread.sleep(1000);
    }

    @Step("<key> id li aramaya <value> değerini yaz")
    public void selectAirportEsb(String key, String value) throws InterruptedException {
        Thread.sleep(1000);
        appiumDriver.findElement(By.id(key)).sendKeys(value);
        Thread.sleep(1000);
    }

    @Step("<esb> xpath li varış havaalanını seç")
    public void clickArriveEsb(String esb) throws InterruptedException {
        Thread.sleep(1000);
        appiumDriver.findElement(By.xpath(esb)).click();
        Thread.sleep(2000);
    }

    @Step("<date> id li tarih sayfasını aç")
     public void datePage(String date) throws InterruptedException {
        Thread.sleep(1000);
        appiumDriver.findElement(By.id(date)).click();

    }
    @Step("<days> xpath li günü seç")
    public void twoDayLater(String days) throws InterruptedException {
        Thread.sleep(1000);
        appiumDriver.findElement(By.xpath(days)).click();
        Thread.sleep(1000);
    }

    @Step("<done> id li butona tıklanır")
    public void clickDoneButton(String done) throws InterruptedException {
        Thread.sleep(1000);
        appiumDriver.findElement(By.id(done)).click();
        Thread.sleep(1000);
    }

    @Step("<adult> xpath li yetişkin seç")
    public void selectAdult(String adult) throws InterruptedException {
        Thread.sleep(1000);
        appiumDriver.findElement(By.xpath(adult)).click();
        Thread.sleep(1000);
    }

    @Step("<flightsearch> id li uçuş arama butonuna tıkla")
    public void clickSearchFlightButton(String flightsearch) throws InterruptedException {
        Thread.sleep(1000);
        appiumDriver.findElement(By.id(flightsearch)).click();
        Thread.sleep(1000);
    }

    @Step("<key> id li elementle <value> xpath li elemtleri  karşılaştır")
    public void aircraftListControl(String key,String xpath) throws InterruptedException {
        Thread.sleep(1000);
        Assert.assertNotNull( appiumDriver.findElement(By.xpath(xpath)));
        Thread.sleep(1000);
    }

    @Step("uçuş bilgileri listesini aç")
    public void selectTicket() throws InterruptedException {
        Thread.sleep(1000);
        MobileElement el1 = (MobileElement) appiumDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[1]/android.widget.FrameLayout[1]/android.view.ViewGroup/android.view.ViewGroup/android.view.View");
        el1.click();
        Thread.sleep(1000);
    }

    @Step("ekonomi sınıfı uçuşu seç")
    public  void  selectEcoTicket() throws InterruptedException {
        Thread.sleep(1000);
        MobileElement el1 = (MobileElement) appiumDriver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/androidx.drawerlayout.widget.DrawerLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[1]/android.widget.FrameLayout[2]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.FrameLayout/android.view.ViewGroup");
        el1.click();
        Thread.sleep(1000);
    }

    @Step("<cont> id li devam butonuna tıkla ve devam et")
    public void clickContinueButton(String cont) throws InterruptedException {
        Thread.sleep(1000);
        appiumDriver.findElement(By.id(cont)).click();
        Thread.sleep(1000);
    }

}