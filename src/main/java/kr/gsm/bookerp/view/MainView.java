package kr.gsm.bookerp.view;

import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import kr.gsm.bookerp.entity.Reply;
import kr.gsm.bookerp.repository.ReplyRepository;

// http://localhost/8081
@Route("")
@PageTitle("Hello, Vaadin!")
public class MainView extends VerticalLayout {
    /*public MainView() {
        add(new H1("박매일, Vaadin!"));
    }*/
    public MainView(ReplyRepository repository) {
        Grid<Reply> grid = new Grid<>(Reply.class);
        grid.setItems(repository.findAll());
        grid.setColumns("id", "title", "content");
        add(new H1("댓글 리스트"), grid);
    }
}