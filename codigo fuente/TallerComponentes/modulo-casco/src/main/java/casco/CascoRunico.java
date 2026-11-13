package casco;

public class CascoRunico implements ProteccionElemental {
    @Override
    public String resistirAtaque(String elemento) {
        if (elemento == null) {
            return "Ataque no identificado: defensa neutralizada";
        }

        String valor = elemento.trim();
        if ("FISICO".equalsIgnoreCase(valor)
                || "FUEGO".equalsIgnoreCase(valor)
                || "ELECTRICO".equalsIgnoreCase(valor)
                || "HIELO".equalsIgnoreCase(valor)
                || "VENENO".equalsIgnoreCase(valor)) {
            return "Ataque elemental bloqueado por el casco runico";
        }

        return "Casco runico: bloqueo parcial ante " + valor;
    }
}
