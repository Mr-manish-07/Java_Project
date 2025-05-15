package firstPkg;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;
import com.vaadin.flow.component.page.AppShellConfigurator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@PWA(name = "Java-Only Web App", shortName = "JavaWeb")
public class VaadinApplication {
	public static void main(String[] args) {
		SpringApplication.run(VaadinApplication.class, args);
	}
}

@Route("")
class MainView extends VerticalLayout {
	public MainView() {
		Button button = new Button("Click Me", e -> Notification.show("Hello, Java Web!"));
		add(button);
	}
}
