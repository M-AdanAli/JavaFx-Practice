package com.adanali.javafx.javafxpractice.Demo18_TreeView;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.StringReader;
import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    TreeView<String> myTreeView;

    public void selectItem(){
        TreeItem<String> currentItem = myTreeView.getSelectionModel().getSelectedItem();

        if (currentItem != null){
            System.out.println(currentItem.getValue());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        TreeItem<String> root = new TreeItem<>("Files", new ImageView(new Image(getClass().getResourceAsStream("/com/adanali/javafx/javafxpractice/Folder-icon.png"))));
        myTreeView.setRoot(root);

        TreeItem<String> branchItem1 = new TreeItem<>("Photos");
        TreeItem<String> branchItem2 = new TreeItem<>("Videos");
        TreeItem<String> branchItem3 = new TreeItem<>("Documents");

        root.getChildren().addAll(branchItem1,branchItem2,branchItem3);

        TreeItem<String> leafItem1 = new TreeItem<>("Photo1");
        TreeItem<String> leafItem2 = new TreeItem<>("Photo2");
        TreeItem<String> leafItem3 = new TreeItem<>("Video1");
        TreeItem<String> leafItem4 = new TreeItem<>("Video2");
        TreeItem<String> leafItem5 = new TreeItem<>("Document1");
        TreeItem<String> leafItem6 = new TreeItem<>("Document2");

        branchItem1.getChildren().addAll(leafItem1,leafItem2);
        branchItem2.getChildren().addAll(leafItem3,leafItem4);
        branchItem3.getChildren().addAll(leafItem5,leafItem6);
    }
}
