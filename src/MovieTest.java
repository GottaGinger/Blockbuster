import org.junit.Assert;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class MovieTest {
    @Test
    void testDVD () {
        ArrayList<String> DVD = new ArrayList<>(Arrays.asList());

        DVD dvd1 = new DVD();
        dvd1.title = "Princess Bride";

        assertEquals("Princess Bride", dvd1.title);
    }

    @Test
    void testDVDTitleSetter() {

        ArrayList<String> DVD = new ArrayList<>(Arrays.asList());

        DVD dvd1 = new DVD();
        dvd1.title ="Princess";

       Assert.assertEquals("Princess",dvd1.title);
    }

    @Test
    void testDVDRuntimeSetter() {

        ArrayList<String> DVD = new ArrayList<>(Arrays.asList());

        Movie dvd1 = new DVD();
        dvd1.title = "Princess Bride";
        dvd1.runTime = 130;

        Assert.assertEquals(130, dvd1.runTime);
    }

    @Test
    void testVHSInstance() {

        ArrayList<String> VHS = new ArrayList<>(Arrays.asList());

        VHS vhs1 = new VHS();
        vhs1.title = "Practical Magic";
        vhs1.runTime = 130;
        vhs1.scenes.add("When the witch flies off the roof");
        vhs1.play();

        Assert.assertEquals(0, vhs1.currentTime);
    }

    @Test
    void testVHSTitleSetter() {

        ArrayList<String> VHS = new ArrayList<>(Arrays.asList());

        VHS vhs1 = new VHS();
        vhs1.title = "Practical Magic";
        vhs1.runTime = 130;
        vhs1.scenes.add("When the witch flies off the roof");
        vhs1.title ="A";

        Assert.assertEquals("A", vhs1.title);
    }

    @Test
    void testVHSRuntimeSetter() {

        ArrayList<String> VHS = new ArrayList<>(Arrays.asList());

        Movie vhs1 = new VHS();
        vhs1.title = "Practical Magic";
        vhs1.runTime = 130;
        vhs1.scenes.add("When the witch flies off the roof");
        vhs1.runTime = 100;

       Assert.assertEquals(100, vhs1.runTime);
    }

    @Test
    void testVHSCurrentTime() {

        ArrayList<String> VHS = new ArrayList<>(Arrays.asList());

        VHS vhs1 = new VHS();
        vhs1.title = "Practical Magic";
        vhs1.runTime = 130;
        vhs1.scenes.add("When the witch flies off the roof");
        vhs1.currentTime=0;

        Assert.assertEquals(0, vhs1.currentTime);
    }

    @Test
    void testVHSPlayMethod() {

        ArrayList<String> TILLScenes = new ArrayList<>(Arrays.asList());

        VHS vhs1 = new VHS();
        vhs1.title = "Practical Magic";
        vhs1.runTime = 130;
        vhs1.scenes.add("When the witch flies off the roof");
        vhs1.play();
        vhs1.play();
        vhs1.play();

        Assert.assertEquals(0, vhs1.currentTime);
    }

    @Test
    void testVHSRewindMethod() {

        ArrayList<String> TILLScenes = new ArrayList<>(Arrays.asList());

        VHS vhs1 = new VHS();
        vhs1.title = "Practical Magic";
        vhs1.runTime = 130;
        vhs1.scenes.add("When the witch flies off the roof");
        vhs1.rewind();


        Assert.assertEquals(0, vhs1.currentTime);
    }

    @Test
    void testVHSRewindMethod2() {

        ArrayList<String> TILLScenes = new ArrayList<>(Arrays.asList());

        VHS vhs1 = new VHS();
        vhs1.title = "Practical Magic";
        vhs1.runTime = 130;
        vhs1.scenes.add("When the witch flies off the roof");
        vhs1.play();
        vhs1.play();
        vhs1.play();
        vhs1.play();

        Assert.assertEquals(0, vhs1.currentTime);
    }
}