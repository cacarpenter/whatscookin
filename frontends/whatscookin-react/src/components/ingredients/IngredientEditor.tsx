import * as React from 'react'
import {Button, TextField} from '@material-ui/core';

export interface IngredientEditorProps {
    title?: string
}

export function IngredientEditor({
                                     title = 'Dr.',
                                 }: IngredientEditorProps) {
    return (
        <div>
            {title}
            <TextField name="Name" title="Name" id="ingredient.name" variant="outlined">Fart Field 1</TextField>
            <Button color="primary">Create</Button>
            <Button color="secondary">Cancel</Button>
        </div>
    )
}