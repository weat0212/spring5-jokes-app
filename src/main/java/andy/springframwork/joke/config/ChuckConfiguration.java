package andy.springframwork.joke.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author weat0212@gmail.com
 * @project jokeapp
 * @package andy.springframwork.joke.config
 * @date 2020/11/26 下午 02:31
 */

//@Configuration
public class ChuckConfiguration {

    //@Bean
    public ChuckNorrisQuotes chuckNorrisQuotes() {
        return new ChuckNorrisQuotes();
    }
}

/*This is a Java configuration example*/
/*Cancel the comment to use the bean*/
/*comment up these annotations for XML configuration example*/
