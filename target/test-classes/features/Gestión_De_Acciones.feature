Feature: Validar Módulo Administración Usuarios

  @Administración_Usuarios_Buscar
  Scenario: Validar opción Buscar del módulo Administración Usuarios
    Given un usuario que ingresa al aplicativo Aquarius
    And se autentica con usuario y contraseña
    When ingresa al módulo de gestión de acciones
    Then valida persona natural y persona jurídica
