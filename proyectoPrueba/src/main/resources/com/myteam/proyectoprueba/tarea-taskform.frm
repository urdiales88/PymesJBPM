{"id":"ab546e3f-f392-4f0f-9037-f876f3386c21","name":"tarea-taskform.frm","model":{"taskName":"tarea","processId":"proyectoPrueba.proyectoPrueba_proceso","name":"task","properties":[{"name":"inObjeto","typeInfo":{"type":"OBJECT","className":"com.myteam.proyectoprueba.objetoPrueba","multiple":false},"metaData":{"entries":[{"name":"field-readOnly","value":true}]}},{"name":"outObjeto","typeInfo":{"type":"OBJECT","className":"com.myteam.proyectoprueba.objetoPrueba","multiple":false},"metaData":{"entries":[{"name":"field-readOnly","value":false}]}}],"formModelType":"org.kie.workbench.common.forms.jbpm.model.authoring.task.TaskFormModel"},"fields":[{"nestedForm":"aff23cc9-e9f4-4d8a-b388-0d6a1a6d08f4","id":"field_104672498911718E11","name":"inObjeto","label":"InObjeto","required":false,"readOnly":true,"validateOnChange":true,"binding":"inObjeto","standaloneClassName":"com.myteam.proyectoprueba.objetoPrueba","code":"SubForm","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.relations.subForm.definition.SubFormFieldDefinition"},{"nestedForm":"aff23cc9-e9f4-4d8a-b388-0d6a1a6d08f4","id":"field_604868928971891E11","name":"outObjeto","label":"OutObjeto","required":false,"readOnly":false,"validateOnChange":true,"binding":"outObjeto","standaloneClassName":"com.myteam.proyectoprueba.objetoPrueba","code":"SubForm","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.relations.subForm.definition.SubFormFieldDefinition"}],"layoutTemplate":{"version":2,"name":"tarea-taskform.frm","style":"FLUID","layoutProperties":{},"rows":[{"height":"12","layoutColumns":[{"span":"12","height":"12","rows":[],"layoutComponents":[{"dragTypeName":"org.uberfire.ext.plugin.client.perspective.editor.layout.editor.HTMLLayoutDragComponent","properties":{"HTML_CODE":"\u003ch3\u003eInputs:\u003c/h3\u003e"}}]}]},{"height":"12","layoutColumns":[{"span":"12","height":"12","rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_104672498911718E11","form_id":"ab546e3f-f392-4f0f-9037-f876f3386c21"}}]}]},{"height":"12","layoutColumns":[{"span":"12","height":"12","rows":[],"layoutComponents":[{"dragTypeName":"org.uberfire.ext.plugin.client.perspective.editor.layout.editor.HTMLLayoutDragComponent","properties":{"HTML_CODE":"\u003ch3\u003eOutputs: Salida\u003cbr\u003e\u003c/h3\u003e"}}]}]},{"height":"12","layoutColumns":[{"span":"12","height":"12","rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_604868928971891E11","form_id":"ab546e3f-f392-4f0f-9037-f876f3386c21"}}]}]},{"height":"12","layoutColumns":[{"span":"12","height":"12","rows":[],"layoutComponents":[{"dragTypeName":"org.uberfire.ext.plugin.client.perspective.editor.layout.editor.HTMLLayoutDragComponent","properties":{"HTML_CODE":"\n \u003cspan style\u003d\"color: brown;\"\u003e\u003cspan style\u003d\"color: mediumblue;\"\u003e\u0026lt;\u003c/span\u003eform\u003cspan style\u003d\"color: mediumblue;\"\u003e\u0026gt;\u003c/span\u003e\u003c/span\u003e\u003cbr\u003e\n \u0026nbsp;\n First name:\u003cspan style\u003d\"color: brown;\"\u003e\u003cspan style\u003d\"color: mediumblue;\"\u003e\u0026lt;\u003c/span\u003ebr\u003cspan style\u003d\"color: mediumblue;\"\u003e\u0026gt;\u003c/span\u003e\u003c/span\u003e\u003cbr\u003e\u0026nbsp; \u003cspan style\u003d\"color: brown;\"\u003e\u003cspan style\u003d\"color: mediumblue;\"\u003e\u0026lt;\u003c/span\u003einput\u003cspan style\u003d\"color: red;\"\u003e type\u003cspan style\u003d\"color: mediumblue;\"\u003e\u003d\"text\"\u003c/span\u003e name\u003cspan style\u003d\"color: mediumblue;\"\u003e\u003d\"firstname\"\u003c/span\u003e\u003c/span\u003e\u003cspan style\u003d\"color: mediumblue;\"\u003e\u0026gt;\u003c/span\u003e\u003c/span\u003e\u003cspan style\u003d\"color: brown;\"\u003e\u003cspan style\u003d\"color: mediumblue;\"\u003e\u0026lt;\u003c/span\u003ebr\u003cspan style\u003d\"color: mediumblue;\"\u003e\u0026gt;\u003c/span\u003e\u003c/span\u003e\u003cbr\u003e\n \u0026nbsp;\n Last name:\u003cspan style\u003d\"color: brown;\"\u003e\u003cspan style\u003d\"color: mediumblue;\"\u003e\u0026lt;\u003c/span\u003ebr\u003cspan style\u003d\"color: mediumblue;\"\u003e\u0026gt;\u003c/span\u003e\u003c/span\u003e\u003cbr\u003e\u0026nbsp; \u003cspan style\u003d\"color: brown;\"\u003e\u003cspan style\u003d\"color: mediumblue;\"\u003e\u0026lt;\u003c/span\u003einput\u003cspan style\u003d\"color: red;\"\u003e type\u003cspan style\u003d\"color: mediumblue;\"\u003e\u003d\"text\"\u003c/span\u003e name\u003cspan style\u003d\"color: mediumblue;\"\u003e\u003d\"lastname\"\u003c/span\u003e\u003c/span\u003e\u003cspan style\u003d\"color: mediumblue;\"\u003e\u0026gt;\u003c/span\u003e\u003c/span\u003e\u003cbr\u003e\n \u003cspan style\u003d\"color: brown;\"\u003e\u003cspan style\u003d\"color: mediumblue;\"\u003e\u0026lt;\u003c/span\u003e/form\u003cspan style\u003d\"color: mediumblue;\"\u003e\u0026gt;\u003c/span\u003e\u003c/span\u003e\n \u003cbr\u003e\u003cbr\u003e"}}]}]}]}}