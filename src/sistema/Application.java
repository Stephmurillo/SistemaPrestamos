/* @authors 
    - Yoselin Rojas | Grupo 04 
    - Stephanny Murillo | Grupo 03
*/

package sistema;

import sistema.presentation.cliente.Controller;
import sistema.presentation.cliente.Model;
import sistema.presentation.cliente.View;

public class Application {

    public static void main(String[] args) {
        Model model = new Model() ;
        View view = new View();
        Controller controller = new Controller(model,view);
        controller.show();
    }
}
