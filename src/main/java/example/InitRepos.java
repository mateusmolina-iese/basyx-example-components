package example;

import org.eclipse.digitaltwin.aas4j.v3.model.AssetAdministrationShell;
import org.eclipse.digitaltwin.aas4j.v3.model.impl.DefaultAssetAdministrationShell;
import org.eclipse.digitaltwin.basyx.aasrepository.AasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class InitRepos implements ApplicationListener<ApplicationReadyEvent> {
	@Autowired
	private AasRepository repository;

	@Override
	public void onApplicationEvent(final ApplicationReadyEvent event) {
		System.out.println("Uploading example Aas to the server");
		repository.createAas(buildAas());
	}

	private static AssetAdministrationShell buildAas() {
		return new DefaultAssetAdministrationShell.Builder().id("aas1").idShort("aas1IdShort").build();
	}
}