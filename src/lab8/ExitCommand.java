/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab8;

/**
 *
 * @author eskimo
 */
public class ExitCommand implements ICommand{
    @Override
    public int execute() {
        System.out.println("Выход");
        return 0;
    }
    
}
