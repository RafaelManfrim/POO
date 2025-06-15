# Projeto Final (P2) - Projeto que reúne o conteúdo do Semestre – Programação Orientada a Objetos

## Objetivo

Desenvolver um sistema orientado a objetos que simule o controle de sensores e
dispositivos em uma residência ou empresa, aplicando os principais conceitos de
Programação Orientada a Objetos.

O sistema deve permitir:

- [x] Cadastrar e gerenciar ambientes (ex: Sala de Aula, Laboratório).
- [x] Controlar diferentes tipos de dispositivos (SensorDeTemperatura, SensorDePresenca, Alarme, Luz etc.).
- [x] Cada dispositivo registra dados e responde a comandos distintos.
- [ ] O sistema deve ser extensível para novos dispositivos.
  
## Requisitos Técnicos (Conceitos Obrigatórios)

- [x] Encapsulamento: Atributos privados + métodos get/set
- [x] Construtores sobrecarregados: Para diferentes formas de inicialização de dispositivos
- [x] Classe abstrata: Superclasse Dispositivo com métodos abstratos ligar() e desligar()
- [x] Herança e Polimorfismo: Subclasses sobrescrevem métodos da superclasse
- [ ] Atributos e métodos estáticos: Contador de dispositivos ativos
- [x] Enum: Status dos dispositivos: LIGADO, DESLIGADO, EM_ALERTA
- [x] Sobrescrita e sobrecarga: Métodos e construtores com comportamentos variados
- [ ] Composição: Classe Ambiente contém lista de dispositivos
  
## Entregas Exigidas

- [ ] Código-fonte completo em Java
- [ ] Slide do diagrama UML das classes
- [ ] Seminário justificando as decisões de projeto e testes demonstrando comportamento polimórfico

## Entrega

- 16/06/2025
