

import com.dio.facade.Facade;
import com.dio.singleton.SingletonEager;
import com.dio.singleton.SingletonLazy;
import com.dio.singleton.SingletonLazyHolder;
import com.dio.strategy.Comportamento;
import com.dio.strategy.ComportamentoAgressivo;
import com.dio.strategy.ComportamentoDefensivo;
import com.dio.strategy.ComportamentoNormal;
import com.dio.strategy.Robo;

public class Teste {
    

    public static void main(String[] args) throws Exception {

        //Singleton
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        //Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();

        robo.setComportamento(normal);
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        //Facade
        Facade facade = new Facade();
        facade.migrarCliente("Rayza", "06683004");
    }
}
