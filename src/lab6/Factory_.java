/*
	Angel Basegoda 13256
	Sergio Cancinos 13062
	Factorty_
	Se encarga de realizar el factory para la selección de implementación de Stack
	
*/
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


class Factory_<E> {
    public Set<E> getSET(int opcion)
    {
        if(opcion==1)
        {
            return new HashSet<E>();
        }
        if (opcion==2)
        {
            return new TreeSet<E>();
        }
        else
        {
            return new LinkedHashSet<E>();
        }
    }
    
}
