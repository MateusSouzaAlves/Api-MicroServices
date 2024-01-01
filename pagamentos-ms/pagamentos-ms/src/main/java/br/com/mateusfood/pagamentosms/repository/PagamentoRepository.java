package br.com.mateusfood.pagamentosms.repository;

import br.com.mateusfood.pagamentosms.model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PagamentoRepository extends JpaRepository<Pagamento,Long> {
}
