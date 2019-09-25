import com.SingerDataJpa.config.DataJpaConfig;
import com.SingerDataJpa.entities.Singer;
import com.SingerDataJpa.service.SingerService;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

import java.util.List;

import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SingerDataJpaTest {



    private GenericApplicationContext ctx;
    private SingerService singerService;

    @Before
    public void setUp(){
        ctx = new AnnotationConfigApplicationContext(DataJpaConfig.class);
        singerService = ctx.getBean(SingerService.class);
        assertNotNull(singerService);
    }
    @Test
    public void testFindAll(){
        List<Singer> singers = singerService.findAll();
        assertTrue(singers.size() > 0);
        listSingers(singers);
    }
    @Test
    public void testFindByFirstName(){
        List<Singer> singers = singerService.findByFirstName("John");
        assertTrue(singers.size() > 0);
        assertEquals(2, singers.size());
        listSingers(singers);
    }
    @Test
    public void testFindByFirstNameAndLastName(){
        List<Singer> singers =
                singerService.findByFirstNameAndLastName("John", "Mayer");
        assertTrue(singers.size() > 0);
        assertEquals(1, singers.size());
        listSingers(singers);
    }
    private static void listSingers(List<Singer> singers) {

        for (Singer singer : singers) {

        }
    }
    @After
    public void tearDown() {
        ctx.close();
    }
}
