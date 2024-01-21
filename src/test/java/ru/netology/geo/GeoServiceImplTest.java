package ru.netology.geo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Location;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class GeoServiceImplTest {
    Random random = new Random();

    @Test
    void byIp() {
       GeoService geoService = new GeoServiceImpl();
        Location loc = geoService.byIp("172." + String.valueOf(random.nextDouble()));
        String actual = "RUSSIA";
        String expected = String.valueOf(loc.getCountry());
        assertEquals(expected, actual);
   }
}