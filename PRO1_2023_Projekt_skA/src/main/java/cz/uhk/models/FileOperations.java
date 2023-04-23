package cz.uhk.models;

import java.io.FileNotFoundException;

public interface FileOperations {
    ShoppingList load() throws FileNotFoundException;
    void write(ShoppingList model);
}
