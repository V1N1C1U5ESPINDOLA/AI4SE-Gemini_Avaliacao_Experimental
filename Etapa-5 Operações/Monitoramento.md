# Monitoramento: Métricas e Logs

## Métricas a Monitorar
- **Disponibilidade:** Uptime do sistema e dos containers.
- **Latência:** Tempo de resposta das APIs (backend) e carregamento do frontend.
- **Erros:** Quantidade e tipos de erros (HTTP 4xx/5xx, falhas de banco, exceções).
- **Uso de recursos:** CPU, memória, disco dos containers.
- **Taxa de requisições:** Número de requisições por minuto.

## Logs
- **Logs de acesso:** Registro de todas as requisições recebidas.
- **Logs de aplicação:** Eventos relevantes, erros, warnings e informações de negócio.
- **Logs de banco de dados:** Falhas de conexão, queries lentas.

## Ferramentas sugeridas
- Prometheus + Grafana (métricas)
- ELK Stack (Elasticsearch, Logstash, Kibana) para logs
- Alertmanager para notificações
