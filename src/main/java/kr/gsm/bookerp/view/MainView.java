package kr.gsm.bookerp.view;

import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

@Route("")
@PageTitle("Hello, Vaadin!")
public class MainView extends VerticalLayout {
    public MainView() {
        add(new H1("Hello, Vaadin!"));
    }
}