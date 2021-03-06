package br.com.dsc.lcdpr.serializers;

import br.com.dsc.lcdpr.util.BigDecimalUtil;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.math.BigDecimal;

public class BigDecimalSerializer extends JsonSerializer<BigDecimal> {

    @Override
    public void serialize(BigDecimal value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
        serializers.defaultSerializeValue(BigDecimalUtil.bigDecimalToStringAndRemovePuncts(value), gen);
    }

}
