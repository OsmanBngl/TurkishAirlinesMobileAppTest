Specification Heading
=====================

This is an executable specification file. This file follows markdown syntax.
Every heading in this file denotes a scenario. Every bulleted point denotes a step.

To execute this specification, run
	gauge specs

Steps
-------------
* "com.android.packageinstaller:id/permission_allow_button" id li elemente tıklanır
* "com.turkishairlines.mobile:id/frPrivacy_btnAccept" id li butona tıkla
* "com.turkishairlines.mobile:id/acMain_btnBooking" id li bilet al butonuna tıkla
* "com.turkishairlines.mobile:id/frDashboard_tvOneWay" id li tek yön uçuşu seç
* "com.turkishairlines.mobile:id/frDashboard_tvFromCode" id li kalkış havaalanı butonuna tıkla
* "3" saniye bekle
* "com.turkishairlines.mobile:id/frAirportSelection_etSearch" id li alana "SAW" değerini yaz
* "//*[@text=\"SAW - Sabiha Gokcen Airport\"]" xpath li elementi seç
* "com.turkishairlines.mobile:id/frDashboard_tvToCode" id li iniş havaalanını seç
* "com.turkishairlines.mobile:id/frAirportSelection_etSearch" id li aramaya "ESB" değerini yaz
* "//*[@text=\"ESB - Ankara Esenboga Airport\"]" xpath li varış havaalanını seç
* "com.turkishairlines.mobile:id/frDashboard_rlDeparture" id li tarih sayfasını aç
* "//*[@text=\"17\"]" xpath li günü seç
* "com.turkishairlines.mobile:id/frDashboard_btnDone" id li butona tıklanır
* "//*[@text=\"5\"]" xpath li yetişkin seç
* "com.turkishairlines.mobile:id/frDashboard_btnSearch" id li uçuş arama butonuna tıkla
* "com.turkishairlines.mobile:id/frFlightSearch_rvFlight" id li elementleri kontrol et
* uçuş bilgileri listesini aç
* ekonomi sınıfı uçuşu seç
* "com.turkishairlines.mobile:id/frFlightSearch_btnContinue" id li devam butonuna tıkla ve devam et