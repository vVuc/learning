# Annotations

## @Builder
    - Gera um construtor com todos os campos
    - Inclui o getter e o setter
    - public User(string name, int age) { this.name = name; this.age = age; }
    - Necesssario criar uma segunda camada para alterar o atributo No DTO

## @NoArgsConstructor
    - Gera um construtor sem argumentos
    - public User() { }

## @AllArgsConstructor
    - Gera um construtor com todos os campos
    - public User(string name, int age) { this.name = name; this.age = age; }

## @Getter
    - Seta todos os campos como public
    - Não Muda o atributo, apenas gera o getter
    - public string getName() { return name; }

## @Setter
    - Seta todos os campos como public
    - Não Muda o atributo, apenas gera o setter
    - public void setName(string name) { this.name = name; }
    - Necesssario criar uma segunda camada para alterar o atributo No DTO
