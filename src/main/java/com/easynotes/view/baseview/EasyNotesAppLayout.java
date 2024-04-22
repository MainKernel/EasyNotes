package com.easynotes.view.baseview;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.orderedlayout.Scroller;
import com.vaadin.flow.component.page.AppShellConfigurator;
import com.vaadin.flow.component.sidenav.SideNav;
import com.vaadin.flow.component.sidenav.SideNavItem;
import com.vaadin.flow.theme.Theme;
import com.vaadin.flow.theme.lumo.Lumo;
import com.vaadin.flow.theme.lumo.LumoUtility;
import org.springframework.security.core.context.SecurityContextHolder;

@Theme(variant = Lumo.DARK)
public class EasyNotesAppLayout extends AppLayout implements AppShellConfigurator {
    private final boolean authenticated = SecurityContextHolder.getContext().getAuthentication().isAuthenticated();

    public EasyNotesAppLayout() {
        DrawerToggle drawerToggle = new DrawerToggle();
        Image image = new Image("classpath:images/EasyNotesLogoWhite.png", "EasyNotes");
        image.setMaxHeight("100px");
        image.setMaxWidth("100px");
        image.addClickListener(event -> getUI().ifPresent(ui -> ui.navigate("main-page")));
        image.setHeightFull();

        SideNav sideNav = getNavTabs();
        Scroller scroller = new Scroller(sideNav);
        scroller.setClassName(LumoUtility.Padding.SMALL);


        addToDrawer(image, scroller);
        addToNavbar(drawerToggle);
    }

    private SideNav getNavTabs() {
        SideNav nav = new SideNav();
        nav.addItem(new SideNavItem("Main Page", "/main-page", VaadinIcon.NEWSPAPER.create()),
                new SideNavItem("Notes", "/notes", VaadinIcon.NOTEBOOK.create()),
                new SideNavItem("Reminders", "/reminders", VaadinIcon.CLOCK.create()),
                new SideNavItem("Url manager", "/urls", VaadinIcon.COMPILE.create())
        );
        if(authenticated){
            nav.addItem(new SideNavItem("My Profile", "/profile", VaadinIcon.USER_CARD.create()));
        nav.addItem(new SideNavItem("Logout", "/logout", VaadinIcon.ARROW_BACKWARD.create()));
        }else{
        new SideNavItem("Login", "/login", VaadinIcon.ANGLE_DOUBLE_RIGHT.create());
    }

        return nav;
    }
}

