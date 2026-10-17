# Reflection — Criação e Uso de uma Lista

Atividade prática do curso **EBAC Back-end Java v2** para experimentar a API Reflection do Java, que permite consultar classes e invocar construtores e métodos em tempo de execução.

## O que o programa faz

A classe `ReflectionLista` instancia uma `ArrayList` por meio de um construtor obtido por Reflection, invoca o método `add` para incluir nomes e percorre a lista invocando os métodos do iterador.

## Conceitos praticados

- Obtenção de metadados de classe com `Class`.
- Consulta de construtores com `getConstructor()`.
- Consulta de métodos com `getMethod()`.
- Criação de instâncias com `newInstance()`.
- Invocação de métodos com `Method.invoke()`.
- Uso de `List`, `ArrayList` e `Iterator`.

## Como executar

Abra o projeto no IntelliJ IDEA e execute `src/ReflectionLista.java).

## Observação

O exercício usa Reflection para demonstrar o mecanismo, embora uma implementação comum usasse diretamente `new ArrayList<String>()`, `lista.add(...)` e um `for-each`. As operações reflexivas podem lançar exceções e reduzem a clareza quando não há necessidade real de comportamento dinâmico.

---

**Curso:** EBAC — Back-end Java v2  
**Tema:** API Reflection
