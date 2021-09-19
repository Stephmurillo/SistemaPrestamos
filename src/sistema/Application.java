/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import sistema.presentation.patron.Controller;
import sistema.presentation.patron.Model;
import sistema.presentation.patron.View;

/**
 *
 * @author muril
 */
public class Application {

    public static void main(String[] args) {
        Model model = new Model() ;
        View view = new View();
        Controller controller = new Controller(model,view);
        controller.show();
    }
}
