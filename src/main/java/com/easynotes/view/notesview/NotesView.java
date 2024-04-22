package com.easynotes.view.notesview;

import com.easynotes.view.baseview.EasyNotesAppLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import jakarta.annotation.security.RolesAllowed;

@Route(value = "notes", layout = EasyNotesAppLayout.class)
@PageTitle("Notes")
@RolesAllowed({"USER", "ADMIN"})
public class NotesView extends VerticalLayout {
    public NotesView() {
        setSizeFull();
        setAlignItems(Alignment.CENTER);
        setJustifyContentMode(JustifyContentMode.CENTER);
        add(new H1("Notes feature coming soon...."));
    }
}
