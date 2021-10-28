package service;

import com.mycompany.biblioteca.service.CalculadoraService;
import org.junit.Assert;
import org.junit.Test;

public class CalculadoraServiceTest {

    @Test
    public void sumarArgumentosCompletos(){
        //1-configuracion inicial
        CalculadoraService calculadoraService = new CalculadoraService();

        Float nA = 2f;
        Float nb = 2f;
        Float valorEsperado = 4f;

        //2-prueba
        Float resultado = calculadoraService.sumar(nA, nb);

        //3-verificar el resultado
        Assert.assertEquals(resultado, valorEsperado, 1);
    }

    @Test
    public void sumarArgumentosNulos(){

    }

    @Test
    public void sumarArgumentosFloatNulos(){

    }

    @Test
    public void AgregarNuemroOk(){
        //1 configuracion inicial
        CalculadoraService calculadoraService = new CalculadoraService();
        Integer numeroAgregar = 1;
        int valorEsperado = 1;
        System.out.println("el tamaño de la lista es "+ calculadoraService.getListaDeNumeros().size());

        //2
        calculadoraService.agregar(numeroAgregar);

        //3
        Assert.assertEquals(valorEsperado, calculadoraService.getListaDeNumeros().size() );
        System.out.println("el tamaño de la lista es "+ calculadoraService.getListaDeNumeros().size());

    }

}
