/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema;

import sistema.presentation.cliente.Controller;
import sistema.presentation.cliente.Model;
import sistema.presentation.cliente.View;

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
