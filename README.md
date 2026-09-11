# Repositório de Atividades: Programação Mobile

## Visão Geral
Este repositório armazena o código-fonte desenvolvido como requisito prático para a disciplina de Programação Mobile. O projeto consiste na resolução de três desafios propostos em aula, tendo como objetivo principal a aplicação e a consolidação técnica dos conceitos de desenvolvimento de software para dispositivos móveis.

## Especificações Técnicas
A aplicação foi arquitetada para a plataforma Android, sob o namespace `br.unasp.ginasio` As ferramentas e tecnologias adotadas refletem os padrões atuais do ecossistema de desenvolvimento nativo:

* **Linguagem de Programação:** Kotlin.
* **Interface de Usuário (UI):** O desenvolvimento do layout e da identidade visual foi estruturado com Jetpack Compose, gerenciado através dos arquivos de configuração de tema (`Color.kt`, `Theme.kt` e `Type.kt`).
* **Automação de Build:** O gerenciamento de dependências e a compilação do projeto são orquestrados pelo Gradle, utilizando a sintaxe Kotlin DSL (`build.gradle.kts`).

## Estrutura do Projeto
A organização dos diretórios segue a padronização oficial recomendada para projetos Android[cite: 1]:

* **`app/src/main/java/br/unasp/ginasio/`**: Contém a base do código-fonte da aplicação, incluindo a `MainActivity.kt` e a separação lógica da interface no pacote `ui`.
* **`app/src/main/res/`**: Diretório dedicado à alocação de recursos estáticos, como mapeamento de strings, definições de cores (`colors.xml`) e ícones em diferentes resoluções (`mipmap`).
* **Manifesto e Configurações**: O arquivo `AndroidManifest.xml` centraliza as declarações de componentes e permissões, enquanto os arquivos na raiz do projeto configuram o ambiente de compilação.
