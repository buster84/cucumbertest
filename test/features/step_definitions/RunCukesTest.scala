package hoge

import org.junit.runner.RunWith
import cucumber.api.junit.Cucumber
import cucumber.examples.scalacalculator._

@RunWith(classOf[Cucumber])
@Cucumber.Options(format = Array("pretty", "html:target/cucumber-html-report"),strict = true, features = Array("test/"), glue = Array("classpath:cucumber.examples.scalacalculator"))
class RunCukesTest
