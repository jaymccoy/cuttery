package com.crosshare.cuttery.views.mainlayout;

import com.crosshare.cuttery.views.MainLayout;
import com.vaadin.flow.component.Composite;
import com.vaadin.flow.component.Text;
import com.vaadin.flow.component.contextmenu.MenuItem;
import com.vaadin.flow.component.contextmenu.SubMenu;
import com.vaadin.flow.component.icon.Icon;
import com.vaadin.flow.component.icon.VaadinIcon;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.menubar.MenuBar;
import com.vaadin.flow.component.menubar.MenuBarVariant;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.router.RouteAlias;
import com.vaadin.flow.theme.lumo.LumoUtility.Gap;

@PageTitle("MainLayout")
@Route(value = "", layout = MainLayout.class)
@RouteAlias(value = "", layout = MainLayout.class)
public class MainLayoutView extends Composite<VerticalLayout> {

    public MainLayoutView() {
        HorizontalLayout layoutRow = new HorizontalLayout();
        VerticalLayout layoutColumn2 = new VerticalLayout();
        MenuBar menu = new MenuBar();
        MenuBar menu2 = new MenuBar();
        VerticalLayout layoutColumn3 = new VerticalLayout();
        LoginForm loginForm = new LoginForm();
        getContent().setWidth("100%");
        getContent().getStyle().set("flex-grow", "1");
        layoutRow.addClassName(Gap.MEDIUM);
        layoutRow.setWidth("100%");
        layoutRow.getStyle().set("flex-grow", "1");
        layoutColumn2.getStyle().set("flex-grow", "1");
        menu.setWidth("min-content");
        setMenuSampleData(menu);
        menu2.setWidth("min-content");
        setMenuSampleData(menu2);
        layoutColumn3.setWidth("100%");
        layoutColumn3.getStyle().set("flex-grow", "1");
        loginForm.setWidth("100%");
        getContent().add(layoutRow);
        layoutRow.add(layoutColumn2);
        layoutColumn2.add(menu);
        layoutColumn2.add(menu2);
        layoutRow.add(layoutColumn3);
        layoutColumn3.add(loginForm);
    }

    private void setMenuSampleData(MenuBar menuBar) {
        menuBar.addThemeVariants(MenuBarVariant.LUMO_ICON);
        MenuItem share = menuBar.addItem(new Text("Share"));
        share.add(new Icon(VaadinIcon.ANGLE_DOWN));
        SubMenu shareSubMenu = share.getSubMenu();
        MenuItem onSocialMedia = shareSubMenu.addItem("On social media");
        SubMenu socialMediaSubMenu = onSocialMedia.getSubMenu();
        socialMediaSubMenu.addItem("Facebook");
        socialMediaSubMenu.addItem("Twitter");
        socialMediaSubMenu.addItem("Instagram");
        shareSubMenu.addItem("By email");
        shareSubMenu.addItem("Get Link");
    }
}
