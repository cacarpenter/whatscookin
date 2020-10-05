import React from 'react';

type Props = {
    title: string,
};

export const HomePage: React.FC<Props> = ({
                                   title,
                                   children,
                               }) => (
    <div>
        <h1>{title}</h1>
        Home
        {children}
    </div>
);
