package clases
import java.io.Serializable
public class Materia (nombre:String, nota:Double) :Serializable {

    var nombreMateria: String = nombre
    var promedioMateria: Double = nota

    override fun toString(): String {
        return "Materia(nombreMateria='$nombreMateria', promedio materia=$promedioMateria)"


    }
}