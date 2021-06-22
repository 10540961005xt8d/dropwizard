package io.dropwizard.kafka;

import brave.Tracing;
import com.codahale.metrics.health.HealthCheckRegistry;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.dropwizard.lifecycle.setup.LifecycleEnvironment;
import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRebalanceListener;

import javax.annotation.Nullable;
import java.util.Map;

@JsonTypeName("mock")
public class MockKafkaConsumerFactory<K, V> extends KafkaConsumerFactory<K, V> {
    @Override
    public Consumer<K, V> build(LifecycleEnvironment lifecycle, HealthCheckRegistry healthChecks, @Nullable Tracing tracing, @Nullable ConsumerRebalanceListener rebalanceListener, Map<String, Object> configOverrides) {
        return null; // no-op
    }

    @Override
    public boolean isValidConfiguration() {
        return true;
    }
}
