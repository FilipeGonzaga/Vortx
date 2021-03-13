import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "D:\\dimi_\\Area de Trabalho\\aulas\\cucumber\\Vortx\\src\\test\\java\\AcessoInvestidores.feature",
		tags = {"@automacao"},
		plugin = {"pretty", "html:target/report-html", "json:target/report.json"},
		monochrome = false,
		snippets = SnippetType.CAMELCASE,
		dryRun = false,
		strict = false

)
public class Runner {

}
