package de.julien.spring;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.server.PWA;

import org.springframework.beans.factory.annotation.Autowired;

@Route
@PWA(name = "Project Base for Vaadin Flow with Spring", shortName = "Project Base")
public class MainView extends VerticalLayout {

    public MainView(@Autowired MessageBean bean) {
        Label label = new Label("Hallo");

        Button button = new Button("Click me",
                e -> Notification.show(bean.getMessage()));
        TextField name = new TextField("Name");
        Button rest = new Button("Show REST Endpoint",
                e -> getUI().get().getPage().setLocation("/echo?name="+name.getValue()));

        add(label, button, name, rest);
    }

}
